package Broadcast

import Clients.ApiClient
import Translators.Group2Translator
import Translators.TranslatorIo

class Broadcast {
    def apiClient = new ApiClient()
    def translators = [new Group2Translator()]

    def broadcast(Map message){
        def response = []

        translators.each { TranslatorIo translators ->
            Map msgToSend = translators.translate(message)
            String  url = translators.getUrl()

            try {
                apiClient.post(url, msgToSend)
            }catch (e){
                response.add([
                        msg: "Couldn't post message:  ${translators.getClass().getName().toString()}",
                        error: e.toString()])
            }
        }
        response
    }
}

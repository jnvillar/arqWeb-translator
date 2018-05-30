package Broadcast

import Clients.ApiClient
import Translators.Group2Translator
import Translators.TranslatorIo

class Broadcast {
    def apiClient = new ApiClient()
    def translators = [new Group2Translator()]

    def broadcast(Map message){
        translators.each { TranslatorIo translators ->
            Map msgToSend = translators.translate(message)
            String  url = translators.getUrl()
            apiClient.post(url, msgToSend)
        }
    }
}

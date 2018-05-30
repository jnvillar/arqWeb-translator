package translator

import Broadcast.Broadcast
import Validators.Validator
import grails.converters.JSON


class TranslatorController {
    Broadcast broadcast = new Broadcast()

    def ping() {
        render "pong"
    }

    def index(){
        def response = [app: "translator"]
        render response as JSON
    }

    def broadcast(){
        Validator.validate(params)
        List<Map> response = broadcast.broadcast(params)
        render response as JSON
    }
}

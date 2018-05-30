package translator

import grails.converters.JSON

class TranslatorController {

    def ping() {
        render "pong" as JSON
    }

    def index(){
        render "translator" as JSON
    }
}

package translator

import Broadcast.Broadcast
import Validators.Validator


class TranslatorController {
    Broadcast broadcast = new Broadcast()

    def ping() {
        render "pong"
    }

    def index(){
        render "translator"
    }

    def broadcast(){
        Validator.validate(params)
        broadcast.broadcast(params)
        render "broadcast done"
    }
}

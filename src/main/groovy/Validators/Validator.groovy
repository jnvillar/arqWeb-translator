package Validators

class Validator {
    static keys = ["from", "msg", "attachment", "chat", "to"]

    static validate(Map message) {
        def keysNotSet = keys.findAll{ message.hasProperty(it) && message[it]}
        if(keysNotSet) throw Exception("Missing key")
    }
}

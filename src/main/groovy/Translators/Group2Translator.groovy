package Translators

class Group2Translator implements TranslatorIo{

    def Map translate(Map message){
        return message
    }

    def String getUrl(){
        return "https://arq-chat.herokuapp.com/integration"
    }
}

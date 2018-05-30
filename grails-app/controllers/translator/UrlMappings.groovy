package translator

class UrlMappings {

    static mappings = {

        "/"(controller: "translator") {
            action = [GET: "index"]
        }

        "/broadcast"(controller: "translator") {
            action = [GET: "index"]
        }

        "/ping"(controller: "translator") {
            action = [GET: "ping"]
        }

        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}

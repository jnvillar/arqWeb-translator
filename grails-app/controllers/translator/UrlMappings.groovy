package translator

class UrlMappings {

    static mappings = {

        "/"(controller: "translator") {
            action = [GET: "index"]
        }

        "/ping"(controller: "translator") {
            action = [GET: "ping"]
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}

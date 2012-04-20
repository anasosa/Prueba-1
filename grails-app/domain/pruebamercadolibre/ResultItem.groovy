package pruebamercadolibre

class ResultItem {
	String thumbnailURL
	String permalink
	String title
	String description
	
    static constraints = {
		title(blank: false)
		permalink(blank: false)
		thumbnailURL(blank:false)
    }
}

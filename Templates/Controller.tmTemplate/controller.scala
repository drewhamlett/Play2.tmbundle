package controllers

import play.api._
import play.api.mvc._

object ${TM_NEW_FILE_BASENAME} extends Controller {

	def index = Action {
		Ok(views.html.index("Your new application is ready."))
	}

}


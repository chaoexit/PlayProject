package controllers;

import play.*;
import play.mvc.*;

import result.Vote;
import views.html.*;

public class Application extends Controller {
    public static Result index() {
        return ok(index.render("Your new application is ready!!!!"));
    }
    public static Result votingresult() { return ok(complete.render(Vote.find.all())); }
}

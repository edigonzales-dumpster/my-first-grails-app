package myapp

import groovy.transform.CompileStatic

import myapp.Make
import myapp.Model
import myapp.Vehicle

@CompileStatic
class BootStrap {

    def init = { servletContext ->

        Make nissan = new Make(name: "Nissan").save()
        Make ford = new Make(name: "Ford").save()

        Model titan = new Model(name: "Titan", make: nissan).save()
        Model leaf = new Model(name: "Leaf", make: nissan).save()
        Model windstar = new Model(name: "Windstar", make: ford).save()

        Vehicle pickup = new Vehicle(name: 'Pickup', make: nissan, model: titan, year: 2012).save()
        Vehicle economy = new Vehicle(name: 'Economy', make: nissan, model: leaf, year: 2014).save()
        Vehicle minivan = new Vehicle(name: 'Minivan', make: ford, model: windstar, year: 1990).save()
    }

    def destroy = {
    }
}

# Sandbox application using cucumber ant selenium rc

Webapp is a showoff application from spring. It is build on spring-mvc 3.
Testing is done via cucumber and selenium rc.

## Installing

To run this example you will need ruby installed.

You will need a bundler gem: 

> sudo gem install bundler

Before first run install needed gems

> bundle

## Running

start selenium rc

> selenium-rc

start tomcat

> cd mvc-webapp
> mvn tomcat:run

run tests

> cd tests
> cucumber

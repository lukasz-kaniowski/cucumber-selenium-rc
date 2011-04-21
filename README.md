# Sandbox application using cucumber ant selenium rc

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

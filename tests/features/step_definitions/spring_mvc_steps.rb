require "selenium/client"
require "rspec/expectations"

def init_browser
  host = "localhost"
  $browser = Selenium::Client::Driver.new \
          :host => host,
          :port => 4444,
          :browser => "*firefox",
          :url => "http://localhost:8080",
          :timeout_in_second => 60
  $browser.start
end

init_browser

at_exit do
  $browser.stop
end

#step definitions

Given /^I am on the "([^\"]*)" page$/ do |page|
  $browser.open "/mvc-webapp"
  $browser.click "link=#{page}"
  sleep 0.3
end

When /^I press "([^\"]*)"$/ do |arg1|
  $browser.click "link=#{arg1}"
  sleep 0.3
end

Then /^I should see "([^\"]*)"$/ do |text|
  ($browser.text? text).should == true
end

When /^I submit$/ do
  $browser.click "//button[@type='submit']"
end

When /^I fill "([^\"]*)" with "([^\"]*)"$/ do |field, value|
  $browser.type field, value
end
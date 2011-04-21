require 'rspec/expectations'

Given /^Presenter is doing a presentation$/ do
   @on_topic = true
end

When /^He is going off topic$/ do
	  @on_topic = false
end

Then /^Audience will boo$/ do
	  (audience_will_boo @on_topic).should == true
end

When /^He is not going off topic$/ do
	@on_topic = true
end

Then /^Audience will not boo$/ do
	  
	  (audience_will_boo @on_topic).should == false
end


def audience_will_boo (on_topic) 
    true
end

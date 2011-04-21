Feature: In order to do good presentation 
	Presenter should not go off topic

	Scenario: Presenter goes off topic
		Given Presenter is doing a presentation
		When He is going off topic
		Then Audience will boo
       Scenario: Presenter dont go off topic
		Given Presenter is doing a presentation
		When He is not going off topic
		Then Audience will not boo

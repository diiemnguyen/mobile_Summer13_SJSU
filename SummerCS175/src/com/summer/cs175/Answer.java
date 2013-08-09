package com.summer.cs175;

public class Answer {
	
	//private variables
	int _id;
	String _question;
	String _answer;
	
	// Empty constructor
	public Answer(){
		
	}
	// constructor
	public Answer(int id, String question, String answer){
		this._id = id;
		this._question = question;
		this._answer = answer;
	}
	
	// constructor
	public Answer(String question, String answer){
		this._question = question;
		this._answer = answer;
	}
	// getting ID
	public int getID(){
		return this._id;
	}
	
	// setting id
	public void setID(int id){
		this._id = id;
	}
	
	// getting name
	public String getQuestion(){
		return this._question;
	}
	
	// setting name
	public void setQuestion(String question){
		this._question = question;
	}
	
	// getting phone number
	public String getAnswer(){
		return this._answer;
	}
	
	// setting phone number
	public void setAnswer(String answer){
		this._answer = answer;
	}
}
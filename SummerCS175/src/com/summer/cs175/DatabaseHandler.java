package com.summer.cs175;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {

	// All Static variables
	// Database Version
	private static final int DATABASE_VERSION = 1;

	// Database Name
	private static final String DATABASE_NAME = "quizManager";

	// Contacts table name
	private static final String TABLE_QUIZ = "quiz";

	// Contacts Table Columns names
	private static final String KEY_ID = "id";
	private static final String KEY_QUESTION = "question";
	private static final String KEY_ANSWER = "answer";

	public DatabaseHandler(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	// Creating Tables
	@Override
	public void onCreate(SQLiteDatabase db) {
		String CREATE_QUIZ_TABLE = "CREATE TABLE " + TABLE_QUIZ + "("
				+ KEY_ID + " INTEGER PRIMARY KEY," + KEY_QUESTION + " TEXT,"
				+ KEY_ANSWER + " TEXT" + ")";
		db.execSQL(CREATE_QUIZ_TABLE);
	}

	// Upgrading database
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// Drop older table if existed
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUIZ);

		// Create tables again
		onCreate(db);
	}

	/**
	 * All CRUD(Create, Read, Update, Delete) Operations
	 */

	// Adding new contact
	void addContact(Answer ans) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_QUESTION, ans.getQuestion()); // Quiz question
		values.put(KEY_ANSWER, ans.getAnswer()); // Quiz answer

		// Inserting Row
		db.insert(TABLE_QUIZ, null, values);
		db.close(); // Closing database connection
	}

	// Getting single quiz (question + answer)
	Answer getQuiz(int id) {
		SQLiteDatabase db = this.getReadableDatabase();

		Cursor cursor = db.query(TABLE_QUIZ, new String[] { KEY_ID,
				KEY_QUESTION, KEY_ANSWER }, KEY_ID + "=?",
				new String[] { String.valueOf(id) }, null, null, null, null);
		if (cursor != null)
			cursor.moveToFirst();

		Answer ans = new Answer(Integer.parseInt(cursor.getString(0)),
				cursor.getString(1), cursor.getString(2));
		// return answer
		return ans;
	}
	
	// Getting All Answers
	public List<Answer> getAllAnswers() {
		List<Answer> ansList = new ArrayList<Answer>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_QUIZ;

		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		// looping through all rows and adding to list
		if (cursor.moveToFirst()) {
			do {
				Answer ans = new Answer();
				ans.setID(Integer.parseInt(cursor.getString(0)));
				ans.setQuestion(cursor.getString(1));
				ans.setAnswer(cursor.getString(2));
				// Adding contact to list
				ansList.add(ans);
			} while (cursor.moveToNext());
		}

		// return answer list
		return ansList;
	}

	// Updating single answer
	public int updateAnswer(Answer ans) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_QUESTION, ans.getQuestion());
		values.put(KEY_ANSWER, ans.getAnswer());

		// updating row
		return db.update(TABLE_QUIZ, values, KEY_ID + " = ?",
				new String[] { String.valueOf(ans.getID()) });
	}

	// Deleting single answer
	public void deleteAnswer(Answer ans) {
		SQLiteDatabase db = this.getWritableDatabase();
		db.delete(TABLE_QUIZ, KEY_ID + " = ?",
				new String[] { String.valueOf(ans.getID()) });
		db.close();
	}


	// Getting answers Count
	public int getAnsCount() {
		String countQuery = "SELECT  * FROM " + TABLE_QUIZ;
		SQLiteDatabase db = this.getReadableDatabase();
		Cursor cursor = db.rawQuery(countQuery, null);
		cursor.close();

		// return count
		return cursor.getCount();
	}

}
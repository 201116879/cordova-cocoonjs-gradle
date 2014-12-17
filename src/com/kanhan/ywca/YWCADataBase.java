package com.kanhan.ywca;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class YWCADataBase extends SQLiteOpenHelper {

     private static YWCADataBase mInstance = null;
        private Context _context;

        public static YWCADataBase getInstance(Context context) {
            /**
             * use the application context as suggested by CommonsWare.
             * this will ensure that you dont accidentally leak an Activitys
             * context (see this article for more information:
             * http://developer.android.com/resources/articles/avoiding-memory-leaks.html)
             */
            if (mInstance == null) {
                mInstance = new YWCADataBase(context.getApplicationContext());
            }
            return mInstance;
        }

        /**
         * constructor should be private to prevent direct instantiation.
         * make call to static factory method "getInstance()" instead.
         */
        private YWCADataBase(Context context) {
            super(context, "ywca.db", null, 1);
            this._context = context;
            /* !!!!! Carefully use for debug , clear all data each time*/
//		        onUpgrade(this.getWritableDatabase(),1,1);
            /***********************************************************/

        }

    @Override
    public void onCreate(SQLiteDatabase db) {


         db.execSQL("CREATE TABLE IF NOT EXISTS ywca_setting(setting_id integer primary key autoincrement, item_music integer, item_sound integer);");
        db.execSQL("INSERT INTO `ywca_setting` VALUES ('1','1','1');");
        db.execSQL("CREATE TABLE IF NOT EXISTS ywca_game(story_id integer primary key autoincrement, item_stage integer,item_stars integer,item_stage_stars_1 integer,item_stage_stars_2 integer,item_stage_stars_3 integer,item_stage_stars_4 integer);"  );
        db.execSQL(
                "INSERT INTO `ywca_game` VALUES ('1','0','0','0','0','0','0');" +
                "INSERT INTO `ywca_game` VALUES ('2','0','0','0','0','0','0');" +
                "INSERT INTO `ywca_game` VALUES ('3','0','0','0','0','0','0');" +
                "INSERT INTO `ywca_game` VALUES ('4','0','0','0','0','0','0');" +
                "INSERT INTO `ywca_game` VALUES ('5','0','0','0','0','0','0');"
        );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


        onCreate(db);
    }

}



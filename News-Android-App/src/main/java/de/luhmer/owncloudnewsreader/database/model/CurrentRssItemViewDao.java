package de.luhmer.owncloudnewsreader.database.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import de.luhmer.owncloudnewsreader.database.model.CurrentRssItemView;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table CURRENT_RSS_ITEM_VIEW.
*/
public class CurrentRssItemViewDao extends AbstractDao<CurrentRssItemView, Long> {

    public static final String TABLENAME = "CURRENT_RSS_ITEM_VIEW";

    /**
     * Properties of entity CurrentRssItemView.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property RssItemId = new Property(1, long.class, "rssItemId", false, "RSS_ITEM_ID");
    };


    public CurrentRssItemViewDao(DaoConfig config) {
        super(config);
    }
    
    public CurrentRssItemViewDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'CURRENT_RSS_ITEM_VIEW' (" + //
                "'_id' INTEGER PRIMARY KEY NOT NULL ," + // 0: id
                "'RSS_ITEM_ID' INTEGER NOT NULL );"); // 1: rssItemId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'CURRENT_RSS_ITEM_VIEW'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, CurrentRssItemView entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
        stmt.bindLong(2, entity.getRssItemId());
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public CurrentRssItemView readEntity(Cursor cursor, int offset) {
        CurrentRssItemView entity = new CurrentRssItemView( //
            cursor.getLong(offset + 0), // id
            cursor.getLong(offset + 1) // rssItemId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, CurrentRssItemView entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setRssItemId(cursor.getLong(offset + 1));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(CurrentRssItemView entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(CurrentRssItemView entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
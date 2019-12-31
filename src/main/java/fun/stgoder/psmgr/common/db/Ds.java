package fun.stgoder.psmgr.common.db;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import fun.stgoder.psmgr.common.Constants;
import org.sql2o.Connection;

public class Ds extends BaseDataSource {

    public static BaseDataSource sqlite0;

    public static void initSqlite0() {
        try {
            HikariConfig config = new HikariConfig();
            config.setDriverClassName("org.sqlite.JDBC");
            config.setJdbcUrl(Constants.DS_SQLITE0_URL);
            config.setPoolName(Constants.DS_SQLITE0_POOL_NAME);
            config.setMaximumPoolSize(Constants.DS_SQLITE0_POOL_SIZE);
            HikariDataSource hikariDataSource = new HikariDataSource(config);
            sqlite0 = new BaseDataSource();
            sqlite0.init(hikariDataSource);
        } catch (Exception e) {
            System.out.println("init sqlite0: " + Constants.DS_SQLITE0_URL + " failed, work without sqlite0 data source");
        }
    }

    public static void main(String[] args) {
        Ds.initSqlite0();
        Ds.sqlite0.dropTableIfExists("test_bean");
        //Ds.sqlite0.createTableFromBean(TestBean.class);
        /*Ds.sqlite0.select(
                new Sql().
                        select("tb.id, tb.name, tb1.text")
                        .from("test_bean").alias("tb")
                        .leftJoin("test_bean1").alias("tb1").on("tb.id = tb1.tb_id")
                        .where("tb.id = :id").sql(),
                new Param("id", "5e016b8ec94c20126e69f67a"), TestBean.class);
        try (Connection conn = Ds.sqlite0.beginTransaction();) { // sqlite not support
            Ds.sqlite0.insert(
                    conn,
                    new Sql()
                            .insert("test_bean")
                            .cols("xx")
                            .values(":xx").sql());
            Ds.sqlite0.update(
                    conn,
                    new Sql()
                            .update("test_bean")
                            .set("name = :name")
                            .where("id = :id").sql()
                    , new Param()
                            .add("id", "5e016b8ec94c20126e69f67a"));
            Ds.sqlite0.delete(
                    conn,
                    new Sql()
                            .delete("test_bean")
                            .where("id = :id").sql(),
                    new Param("id", "5e016b8ec94c20126e69f67a"));
            conn.commit();
        }*/
    }
}

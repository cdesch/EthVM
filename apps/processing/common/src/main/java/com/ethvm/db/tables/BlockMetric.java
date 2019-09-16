/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables;


import com.ethvm.db.Public;
import com.ethvm.db.tables.records.BlockMetricRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BlockMetric extends TableImpl<BlockMetricRecord> {

    private static final long serialVersionUID = 798013173;

    /**
     * The reference instance of <code>public.block_metric</code>
     */
    public static final BlockMetric BLOCK_METRIC = new BlockMetric();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BlockMetricRecord> getRecordType() {
        return BlockMetricRecord.class;
    }

    /**
     * The column <code>public.block_metric.number</code>.
     */
    public final TableField<BlockMetricRecord, BigDecimal> NUMBER = createField("number", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>public.block_metric.hash</code>.
     */
    public final TableField<BlockMetricRecord, String> HASH = createField("hash", org.jooq.impl.SQLDataType.CHAR(66), this, "");

    /**
     * The column <code>public.block_metric.timestamp</code>.
     */
    public final TableField<BlockMetricRecord, Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.block_metric.block_time</code>.
     */
    public final TableField<BlockMetricRecord, Integer> BLOCK_TIME = createField("block_time", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.block_metric.num_uncles</code>.
     */
    public final TableField<BlockMetricRecord, Integer> NUM_UNCLES = createField("num_uncles", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.block_metric.difficulty</code>.
     */
    public final TableField<BlockMetricRecord, BigDecimal> DIFFICULTY = createField("difficulty", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>public.block_metric.total_difficulty</code>.
     */
    public final TableField<BlockMetricRecord, BigDecimal> TOTAL_DIFFICULTY = createField("total_difficulty", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>public.block_metric.total_gas_price</code>.
     */
    public final TableField<BlockMetricRecord, BigDecimal> TOTAL_GAS_PRICE = createField("total_gas_price", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>public.block_metric.avg_gas_limit</code>.
     */
    public final TableField<BlockMetricRecord, BigDecimal> AVG_GAS_LIMIT = createField("avg_gas_limit", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>public.block_metric.avg_gas_price</code>.
     */
    public final TableField<BlockMetricRecord, BigDecimal> AVG_GAS_PRICE = createField("avg_gas_price", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>public.block_metric.total_txs</code>.
     */
    public final TableField<BlockMetricRecord, Integer> TOTAL_TXS = createField("total_txs", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.block_metric.num_successful_txs</code>.
     */
    public final TableField<BlockMetricRecord, Integer> NUM_SUCCESSFUL_TXS = createField("num_successful_txs", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.block_metric.num_failed_txs</code>.
     */
    public final TableField<BlockMetricRecord, Integer> NUM_FAILED_TXS = createField("num_failed_txs", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.block_metric.num_internal_txs</code>.
     */
    public final TableField<BlockMetricRecord, Integer> NUM_INTERNAL_TXS = createField("num_internal_txs", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.block_metric.total_tx_fees</code>.
     */
    public final TableField<BlockMetricRecord, BigDecimal> TOTAL_TX_FEES = createField("total_tx_fees", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>public.block_metric.avg_tx_fees</code>.
     */
    public final TableField<BlockMetricRecord, BigDecimal> AVG_TX_FEES = createField("avg_tx_fees", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * Create a <code>public.block_metric</code> table reference
     */
    public BlockMetric() {
        this(DSL.name("block_metric"), null);
    }

    /**
     * Create an aliased <code>public.block_metric</code> table reference
     */
    public BlockMetric(String alias) {
        this(DSL.name(alias), BLOCK_METRIC);
    }

    /**
     * Create an aliased <code>public.block_metric</code> table reference
     */
    public BlockMetric(Name alias) {
        this(alias, BLOCK_METRIC);
    }

    private BlockMetric(Name alias, Table<BlockMetricRecord> aliased) {
        this(alias, aliased, null);
    }

    private BlockMetric(Name alias, Table<BlockMetricRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> BlockMetric(Table<O> child, ForeignKey<O, BlockMetricRecord> key) {
        super(child, key, BLOCK_METRIC);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetric as(String alias) {
        return new BlockMetric(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetric as(Name alias) {
        return new BlockMetric(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BlockMetric rename(String name) {
        return new BlockMetric(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BlockMetric rename(Name name) {
        return new BlockMetric(name, null);
    }
}

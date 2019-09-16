/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables.records;


import com.ethvm.db.tables.BlockMetric;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.TableRecordImpl;


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
public class BlockMetricRecord extends TableRecordImpl<BlockMetricRecord> implements Record16<BigDecimal, String, Timestamp, Integer, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Integer, Integer, Integer, Integer, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = -1227583864;

    /**
     * Setter for <code>public.block_metric.number</code>.
     */
    public BlockMetricRecord setNumber(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metric.number</code>.
     */
    public BigDecimal getNumber() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>public.block_metric.hash</code>.
     */
    public BlockMetricRecord setHash(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metric.hash</code>.
     */
    public String getHash() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.block_metric.timestamp</code>.
     */
    public BlockMetricRecord setTimestamp(Timestamp value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metric.timestamp</code>.
     */
    public Timestamp getTimestamp() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>public.block_metric.block_time</code>.
     */
    public BlockMetricRecord setBlockTime(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metric.block_time</code>.
     */
    public Integer getBlockTime() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.block_metric.num_uncles</code>.
     */
    public BlockMetricRecord setNumUncles(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metric.num_uncles</code>.
     */
    public Integer getNumUncles() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.block_metric.difficulty</code>.
     */
    public BlockMetricRecord setDifficulty(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metric.difficulty</code>.
     */
    public BigDecimal getDifficulty() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>public.block_metric.total_difficulty</code>.
     */
    public BlockMetricRecord setTotalDifficulty(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metric.total_difficulty</code>.
     */
    public BigDecimal getTotalDifficulty() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>public.block_metric.total_gas_price</code>.
     */
    public BlockMetricRecord setTotalGasPrice(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metric.total_gas_price</code>.
     */
    public BigDecimal getTotalGasPrice() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>public.block_metric.avg_gas_limit</code>.
     */
    public BlockMetricRecord setAvgGasLimit(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metric.avg_gas_limit</code>.
     */
    public BigDecimal getAvgGasLimit() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>public.block_metric.avg_gas_price</code>.
     */
    public BlockMetricRecord setAvgGasPrice(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metric.avg_gas_price</code>.
     */
    public BigDecimal getAvgGasPrice() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>public.block_metric.total_txs</code>.
     */
    public BlockMetricRecord setTotalTxs(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metric.total_txs</code>.
     */
    public Integer getTotalTxs() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>public.block_metric.num_successful_txs</code>.
     */
    public BlockMetricRecord setNumSuccessfulTxs(Integer value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metric.num_successful_txs</code>.
     */
    public Integer getNumSuccessfulTxs() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>public.block_metric.num_failed_txs</code>.
     */
    public BlockMetricRecord setNumFailedTxs(Integer value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metric.num_failed_txs</code>.
     */
    public Integer getNumFailedTxs() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>public.block_metric.num_internal_txs</code>.
     */
    public BlockMetricRecord setNumInternalTxs(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metric.num_internal_txs</code>.
     */
    public Integer getNumInternalTxs() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>public.block_metric.total_tx_fees</code>.
     */
    public BlockMetricRecord setTotalTxFees(BigDecimal value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metric.total_tx_fees</code>.
     */
    public BigDecimal getTotalTxFees() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>public.block_metric.avg_tx_fees</code>.
     */
    public BlockMetricRecord setAvgTxFees(BigDecimal value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>public.block_metric.avg_tx_fees</code>.
     */
    public BigDecimal getAvgTxFees() {
        return (BigDecimal) get(15);
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<BigDecimal, String, Timestamp, Integer, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Integer, Integer, Integer, Integer, BigDecimal, BigDecimal> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<BigDecimal, String, Timestamp, Integer, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Integer, Integer, Integer, Integer, BigDecimal, BigDecimal> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return BlockMetric.BLOCK_METRIC.NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return BlockMetric.BLOCK_METRIC.HASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return BlockMetric.BLOCK_METRIC.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return BlockMetric.BLOCK_METRIC.BLOCK_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return BlockMetric.BLOCK_METRIC.NUM_UNCLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return BlockMetric.BLOCK_METRIC.DIFFICULTY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return BlockMetric.BLOCK_METRIC.TOTAL_DIFFICULTY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return BlockMetric.BLOCK_METRIC.TOTAL_GAS_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return BlockMetric.BLOCK_METRIC.AVG_GAS_LIMIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return BlockMetric.BLOCK_METRIC.AVG_GAS_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return BlockMetric.BLOCK_METRIC.TOTAL_TXS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return BlockMetric.BLOCK_METRIC.NUM_SUCCESSFUL_TXS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return BlockMetric.BLOCK_METRIC.NUM_FAILED_TXS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return BlockMetric.BLOCK_METRIC.NUM_INTERNAL_TXS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field15() {
        return BlockMetric.BLOCK_METRIC.TOTAL_TX_FEES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field16() {
        return BlockMetric.BLOCK_METRIC.AVG_TX_FEES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component1() {
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getBlockTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getNumUncles();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getDifficulty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getTotalDifficulty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getTotalGasPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getAvgGasLimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getAvgGasPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getTotalTxs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getNumSuccessfulTxs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getNumFailedTxs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getNumInternalTxs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component15() {
        return getTotalTxFees();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component16() {
        return getAvgTxFees();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value1() {
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getBlockTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getNumUncles();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getDifficulty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getTotalDifficulty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getTotalGasPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getAvgGasLimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getAvgGasPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getTotalTxs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getNumSuccessfulTxs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getNumFailedTxs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getNumInternalTxs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value15() {
        return getTotalTxFees();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value16() {
        return getAvgTxFees();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricRecord value1(BigDecimal value) {
        setNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricRecord value2(String value) {
        setHash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricRecord value3(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricRecord value4(Integer value) {
        setBlockTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricRecord value5(Integer value) {
        setNumUncles(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricRecord value6(BigDecimal value) {
        setDifficulty(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricRecord value7(BigDecimal value) {
        setTotalDifficulty(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricRecord value8(BigDecimal value) {
        setTotalGasPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricRecord value9(BigDecimal value) {
        setAvgGasLimit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricRecord value10(BigDecimal value) {
        setAvgGasPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricRecord value11(Integer value) {
        setTotalTxs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricRecord value12(Integer value) {
        setNumSuccessfulTxs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricRecord value13(Integer value) {
        setNumFailedTxs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricRecord value14(Integer value) {
        setNumInternalTxs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricRecord value15(BigDecimal value) {
        setTotalTxFees(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricRecord value16(BigDecimal value) {
        setAvgTxFees(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockMetricRecord values(BigDecimal value1, String value2, Timestamp value3, Integer value4, Integer value5, BigDecimal value6, BigDecimal value7, BigDecimal value8, BigDecimal value9, BigDecimal value10, Integer value11, Integer value12, Integer value13, Integer value14, BigDecimal value15, BigDecimal value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BlockMetricRecord
     */
    public BlockMetricRecord() {
        super(BlockMetric.BLOCK_METRIC);
    }

    /**
     * Create a detached, initialised BlockMetricRecord
     */
    public BlockMetricRecord(BigDecimal number, String hash, Timestamp timestamp, Integer blockTime, Integer numUncles, BigDecimal difficulty, BigDecimal totalDifficulty, BigDecimal totalGasPrice, BigDecimal avgGasLimit, BigDecimal avgGasPrice, Integer totalTxs, Integer numSuccessfulTxs, Integer numFailedTxs, Integer numInternalTxs, BigDecimal totalTxFees, BigDecimal avgTxFees) {
        super(BlockMetric.BLOCK_METRIC);

        set(0, number);
        set(1, hash);
        set(2, timestamp);
        set(3, blockTime);
        set(4, numUncles);
        set(5, difficulty);
        set(6, totalDifficulty);
        set(7, totalGasPrice);
        set(8, avgGasLimit);
        set(9, avgGasPrice);
        set(10, totalTxs);
        set(11, numSuccessfulTxs);
        set(12, numFailedTxs);
        set(13, numInternalTxs);
        set(14, totalTxFees);
        set(15, avgTxFees);
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db;


import com.ethvm.db.tables.AddressContractsCreatedCount;
import com.ethvm.db.tables.AddressContractsCreatedCountDelta;
import com.ethvm.db.tables.AddressInternalTransactionCount;
import com.ethvm.db.tables.AddressInternalTransactionCountDelta;
import com.ethvm.db.tables.AddressTokenCount;
import com.ethvm.db.tables.AddressTokenCountDelta;
import com.ethvm.db.tables.AddressTransactionCount;
import com.ethvm.db.tables.AddressTransactionCountDelta;
import com.ethvm.db.tables.Balance;
import com.ethvm.db.tables.BalanceDelta;
import com.ethvm.db.tables.BlockHeader;
import com.ethvm.db.tables.BlockMetricsHeader;
import com.ethvm.db.tables.BlockMetricsTrace;
import com.ethvm.db.tables.CanonicalCount;
import com.ethvm.db.tables.CoinExchangeRate;
import com.ethvm.db.tables.Contract;
import com.ethvm.db.tables.ContractHolderCount;
import com.ethvm.db.tables.ContractHolderCountDelta;
import com.ethvm.db.tables.ContractMetadata;
import com.ethvm.db.tables.EthListContractMetadata;
import com.ethvm.db.tables.FlywaySchemaHistory;
import com.ethvm.db.tables.MinerBlockCount;
import com.ethvm.db.tables.ProcessorHashLog;
import com.ethvm.db.tables.SyncStatus;
import com.ethvm.db.tables.SyncStatusHistory;
import com.ethvm.db.tables.TokenExchangeRate;
import com.ethvm.db.tables.Trace;
import com.ethvm.db.tables.Transaction;
import com.ethvm.db.tables.TransactionReceipt;
import com.ethvm.db.tables.Uncle;
import com.ethvm.db.tables.records.AddressContractsCreatedCountDeltaRecord;
import com.ethvm.db.tables.records.AddressContractsCreatedCountRecord;
import com.ethvm.db.tables.records.AddressInternalTransactionCountDeltaRecord;
import com.ethvm.db.tables.records.AddressInternalTransactionCountRecord;
import com.ethvm.db.tables.records.AddressTokenCountDeltaRecord;
import com.ethvm.db.tables.records.AddressTokenCountRecord;
import com.ethvm.db.tables.records.AddressTransactionCountDeltaRecord;
import com.ethvm.db.tables.records.AddressTransactionCountRecord;
import com.ethvm.db.tables.records.BalanceDeltaRecord;
import com.ethvm.db.tables.records.BalanceRecord;
import com.ethvm.db.tables.records.BlockHeaderRecord;
import com.ethvm.db.tables.records.BlockMetricsHeaderRecord;
import com.ethvm.db.tables.records.BlockMetricsTraceRecord;
import com.ethvm.db.tables.records.CanonicalCountRecord;
import com.ethvm.db.tables.records.CoinExchangeRateRecord;
import com.ethvm.db.tables.records.ContractHolderCountDeltaRecord;
import com.ethvm.db.tables.records.ContractHolderCountRecord;
import com.ethvm.db.tables.records.ContractMetadataRecord;
import com.ethvm.db.tables.records.ContractRecord;
import com.ethvm.db.tables.records.EthListContractMetadataRecord;
import com.ethvm.db.tables.records.FlywaySchemaHistoryRecord;
import com.ethvm.db.tables.records.MinerBlockCountRecord;
import com.ethvm.db.tables.records.ProcessorHashLogRecord;
import com.ethvm.db.tables.records.SyncStatusHistoryRecord;
import com.ethvm.db.tables.records.SyncStatusRecord;
import com.ethvm.db.tables.records.TokenExchangeRateRecord;
import com.ethvm.db.tables.records.TraceRecord;
import com.ethvm.db.tables.records.TransactionReceiptRecord;
import com.ethvm.db.tables.records.TransactionRecord;
import com.ethvm.db.tables.records.UncleRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AddressContractsCreatedCountDeltaRecord, Long> IDENTITY_ADDRESS_CONTRACTS_CREATED_COUNT_DELTA = Identities0.IDENTITY_ADDRESS_CONTRACTS_CREATED_COUNT_DELTA;
    public static final Identity<AddressInternalTransactionCountDeltaRecord, Long> IDENTITY_ADDRESS_INTERNAL_TRANSACTION_COUNT_DELTA = Identities0.IDENTITY_ADDRESS_INTERNAL_TRANSACTION_COUNT_DELTA;
    public static final Identity<AddressTokenCountDeltaRecord, Long> IDENTITY_ADDRESS_TOKEN_COUNT_DELTA = Identities0.IDENTITY_ADDRESS_TOKEN_COUNT_DELTA;
    public static final Identity<AddressTransactionCountDeltaRecord, Long> IDENTITY_ADDRESS_TRANSACTION_COUNT_DELTA = Identities0.IDENTITY_ADDRESS_TRANSACTION_COUNT_DELTA;
    public static final Identity<BalanceRecord, Long> IDENTITY_BALANCE = Identities0.IDENTITY_BALANCE;
    public static final Identity<BalanceDeltaRecord, Long> IDENTITY_BALANCE_DELTA = Identities0.IDENTITY_BALANCE_DELTA;
    public static final Identity<ContractHolderCountDeltaRecord, Long> IDENTITY_CONTRACT_HOLDER_COUNT_DELTA = Identities0.IDENTITY_CONTRACT_HOLDER_COUNT_DELTA;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AddressContractsCreatedCountRecord> ADDRESS_CONTRACTS_CREATED_COUNT_PKEY = UniqueKeys0.ADDRESS_CONTRACTS_CREATED_COUNT_PKEY;
    public static final UniqueKey<AddressContractsCreatedCountDeltaRecord> ADDRESS_CONTRACTS_CREATED_COUNT_DELTA_PKEY = UniqueKeys0.ADDRESS_CONTRACTS_CREATED_COUNT_DELTA_PKEY;
    public static final UniqueKey<AddressContractsCreatedCountDeltaRecord> ADDRESS_CONTRACTS_CREATED_COUNT_DELTA_ADDRESS_BLOCK_NUMBER_KEY = UniqueKeys0.ADDRESS_CONTRACTS_CREATED_COUNT_DELTA_ADDRESS_BLOCK_NUMBER_KEY;
    public static final UniqueKey<AddressInternalTransactionCountRecord> ADDRESS_INTERNAL_TRANSACTION_COUNT_PKEY = UniqueKeys0.ADDRESS_INTERNAL_TRANSACTION_COUNT_PKEY;
    public static final UniqueKey<AddressInternalTransactionCountDeltaRecord> ADDRESS_INTERNAL_TRANSACTION_COUNT_DELTA_PKEY = UniqueKeys0.ADDRESS_INTERNAL_TRANSACTION_COUNT_DELTA_PKEY;
    public static final UniqueKey<AddressInternalTransactionCountDeltaRecord> ADDRESS_INTERNAL_TRANSACTION_COUNT_DEL_ADDRESS_BLOCK_NUMBER_KEY = UniqueKeys0.ADDRESS_INTERNAL_TRANSACTION_COUNT_DEL_ADDRESS_BLOCK_NUMBER_KEY;
    public static final UniqueKey<AddressTokenCountRecord> ADDRESS_TOKEN_COUNT_PKEY = UniqueKeys0.ADDRESS_TOKEN_COUNT_PKEY;
    public static final UniqueKey<AddressTokenCountDeltaRecord> ADDRESS_TOKEN_COUNT_DELTA_PKEY = UniqueKeys0.ADDRESS_TOKEN_COUNT_DELTA_PKEY;
    public static final UniqueKey<AddressTransactionCountRecord> ADDRESS_TRANSACTION_COUNT_PKEY = UniqueKeys0.ADDRESS_TRANSACTION_COUNT_PKEY;
    public static final UniqueKey<AddressTransactionCountDeltaRecord> ADDRESS_TRANSACTION_COUNT_DELTA_PKEY = UniqueKeys0.ADDRESS_TRANSACTION_COUNT_DELTA_PKEY;
    public static final UniqueKey<AddressTransactionCountDeltaRecord> ADDRESS_TRANSACTION_COUNT_DELTA_ADDRESS_BLOCK_NUMBER_KEY = UniqueKeys0.ADDRESS_TRANSACTION_COUNT_DELTA_ADDRESS_BLOCK_NUMBER_KEY;
    public static final UniqueKey<BalanceRecord> BALANCE_PKEY = UniqueKeys0.BALANCE_PKEY;
    public static final UniqueKey<BalanceDeltaRecord> BALANCE_DELTA_PKEY = UniqueKeys0.BALANCE_DELTA_PKEY;
    public static final UniqueKey<BlockHeaderRecord> BLOCK_HEADER_PKEY = UniqueKeys0.BLOCK_HEADER_PKEY;
    public static final UniqueKey<BlockHeaderRecord> BLOCK_HEADER_HASH_KEY = UniqueKeys0.BLOCK_HEADER_HASH_KEY;
    public static final UniqueKey<BlockHeaderRecord> BLOCK_HEADER_PARENT_HASH_KEY = UniqueKeys0.BLOCK_HEADER_PARENT_HASH_KEY;
    public static final UniqueKey<BlockMetricsHeaderRecord> BLOCK_METRICS_HEADER_NUMBER_TIMESTAMP_KEY = UniqueKeys0.BLOCK_METRICS_HEADER_NUMBER_TIMESTAMP_KEY;
    public static final UniqueKey<BlockMetricsTraceRecord> BLOCK_METRICS_TRACE_NUMBER_TIMESTAMP_KEY = UniqueKeys0.BLOCK_METRICS_TRACE_NUMBER_TIMESTAMP_KEY;
    public static final UniqueKey<CanonicalCountRecord> CANONICAL_COUNT_PKEY = UniqueKeys0.CANONICAL_COUNT_PKEY;
    public static final UniqueKey<CoinExchangeRateRecord> COIN_EXCHANGE_RATE_PKEY = UniqueKeys0.COIN_EXCHANGE_RATE_PKEY;
    public static final UniqueKey<ContractRecord> CONTRACT_PKEY = UniqueKeys0.CONTRACT_PKEY;
    public static final UniqueKey<ContractHolderCountRecord> CONTRACT_HOLDER_COUNT_PKEY = UniqueKeys0.CONTRACT_HOLDER_COUNT_PKEY;
    public static final UniqueKey<ContractHolderCountDeltaRecord> CONTRACT_HOLDER_COUNT_DELTA_PKEY = UniqueKeys0.CONTRACT_HOLDER_COUNT_DELTA_PKEY;
    public static final UniqueKey<ContractMetadataRecord> CONTRACT_METADATA_PKEY = UniqueKeys0.CONTRACT_METADATA_PKEY;
    public static final UniqueKey<EthListContractMetadataRecord> ETH_LIST_CONTRACT_METADATA_PKEY = UniqueKeys0.ETH_LIST_CONTRACT_METADATA_PKEY;
    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = UniqueKeys0.FLYWAY_SCHEMA_HISTORY_PK;
    public static final UniqueKey<MinerBlockCountRecord> MINER_BLOCK_COUNT_PKEY = UniqueKeys0.MINER_BLOCK_COUNT_PKEY;
    public static final UniqueKey<ProcessorHashLogRecord> PROCESSOR_HASH_LOG_PKEY = UniqueKeys0.PROCESSOR_HASH_LOG_PKEY;
    public static final UniqueKey<SyncStatusRecord> SYNC_STATUS_PKEY = UniqueKeys0.SYNC_STATUS_PKEY;
    public static final UniqueKey<SyncStatusHistoryRecord> SYNC_STATUS_HISTORY_PKEY = UniqueKeys0.SYNC_STATUS_HISTORY_PKEY;
    public static final UniqueKey<TokenExchangeRateRecord> TOKEN_EXCHANGE_RATE_PKEY = UniqueKeys0.TOKEN_EXCHANGE_RATE_PKEY;
    public static final UniqueKey<TraceRecord> TRACE_BLOCK_HASH_TRANSACTION_HASH_KEY = UniqueKeys0.TRACE_BLOCK_HASH_TRANSACTION_HASH_KEY;
    public static final UniqueKey<TransactionRecord> TRANSACTION_PKEY = UniqueKeys0.TRANSACTION_PKEY;
    public static final UniqueKey<TransactionReceiptRecord> TRANSACTION_RECEIPT_PKEY = UniqueKeys0.TRANSACTION_RECEIPT_PKEY;
    public static final UniqueKey<UncleRecord> UNCLE_PKEY = UniqueKeys0.UNCLE_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<AddressContractsCreatedCountDeltaRecord, Long> IDENTITY_ADDRESS_CONTRACTS_CREATED_COUNT_DELTA = Internal.createIdentity(AddressContractsCreatedCountDelta.ADDRESS_CONTRACTS_CREATED_COUNT_DELTA, AddressContractsCreatedCountDelta.ADDRESS_CONTRACTS_CREATED_COUNT_DELTA.ID);
        public static Identity<AddressInternalTransactionCountDeltaRecord, Long> IDENTITY_ADDRESS_INTERNAL_TRANSACTION_COUNT_DELTA = Internal.createIdentity(AddressInternalTransactionCountDelta.ADDRESS_INTERNAL_TRANSACTION_COUNT_DELTA, AddressInternalTransactionCountDelta.ADDRESS_INTERNAL_TRANSACTION_COUNT_DELTA.ID);
        public static Identity<AddressTokenCountDeltaRecord, Long> IDENTITY_ADDRESS_TOKEN_COUNT_DELTA = Internal.createIdentity(AddressTokenCountDelta.ADDRESS_TOKEN_COUNT_DELTA, AddressTokenCountDelta.ADDRESS_TOKEN_COUNT_DELTA.ID);
        public static Identity<AddressTransactionCountDeltaRecord, Long> IDENTITY_ADDRESS_TRANSACTION_COUNT_DELTA = Internal.createIdentity(AddressTransactionCountDelta.ADDRESS_TRANSACTION_COUNT_DELTA, AddressTransactionCountDelta.ADDRESS_TRANSACTION_COUNT_DELTA.ID);
        public static Identity<BalanceRecord, Long> IDENTITY_BALANCE = Internal.createIdentity(Balance.BALANCE, Balance.BALANCE.ID);
        public static Identity<BalanceDeltaRecord, Long> IDENTITY_BALANCE_DELTA = Internal.createIdentity(BalanceDelta.BALANCE_DELTA, BalanceDelta.BALANCE_DELTA.ID);
        public static Identity<ContractHolderCountDeltaRecord, Long> IDENTITY_CONTRACT_HOLDER_COUNT_DELTA = Internal.createIdentity(ContractHolderCountDelta.CONTRACT_HOLDER_COUNT_DELTA, ContractHolderCountDelta.CONTRACT_HOLDER_COUNT_DELTA.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<AddressContractsCreatedCountRecord> ADDRESS_CONTRACTS_CREATED_COUNT_PKEY = Internal.createUniqueKey(AddressContractsCreatedCount.ADDRESS_CONTRACTS_CREATED_COUNT, "address_contracts_created_count_pkey", AddressContractsCreatedCount.ADDRESS_CONTRACTS_CREATED_COUNT.ADDRESS, AddressContractsCreatedCount.ADDRESS_CONTRACTS_CREATED_COUNT.BLOCK_NUMBER);
        public static final UniqueKey<AddressContractsCreatedCountDeltaRecord> ADDRESS_CONTRACTS_CREATED_COUNT_DELTA_PKEY = Internal.createUniqueKey(AddressContractsCreatedCountDelta.ADDRESS_CONTRACTS_CREATED_COUNT_DELTA, "address_contracts_created_count_delta_pkey", AddressContractsCreatedCountDelta.ADDRESS_CONTRACTS_CREATED_COUNT_DELTA.ID);
        public static final UniqueKey<AddressContractsCreatedCountDeltaRecord> ADDRESS_CONTRACTS_CREATED_COUNT_DELTA_ADDRESS_BLOCK_NUMBER_KEY = Internal.createUniqueKey(AddressContractsCreatedCountDelta.ADDRESS_CONTRACTS_CREATED_COUNT_DELTA, "address_contracts_created_count_delta_address_block_number_key", AddressContractsCreatedCountDelta.ADDRESS_CONTRACTS_CREATED_COUNT_DELTA.ADDRESS, AddressContractsCreatedCountDelta.ADDRESS_CONTRACTS_CREATED_COUNT_DELTA.BLOCK_NUMBER);
        public static final UniqueKey<AddressInternalTransactionCountRecord> ADDRESS_INTERNAL_TRANSACTION_COUNT_PKEY = Internal.createUniqueKey(AddressInternalTransactionCount.ADDRESS_INTERNAL_TRANSACTION_COUNT, "address_internal_transaction_count_pkey", AddressInternalTransactionCount.ADDRESS_INTERNAL_TRANSACTION_COUNT.ADDRESS, AddressInternalTransactionCount.ADDRESS_INTERNAL_TRANSACTION_COUNT.BLOCK_NUMBER);
        public static final UniqueKey<AddressInternalTransactionCountDeltaRecord> ADDRESS_INTERNAL_TRANSACTION_COUNT_DELTA_PKEY = Internal.createUniqueKey(AddressInternalTransactionCountDelta.ADDRESS_INTERNAL_TRANSACTION_COUNT_DELTA, "address_internal_transaction_count_delta_pkey", AddressInternalTransactionCountDelta.ADDRESS_INTERNAL_TRANSACTION_COUNT_DELTA.ID);
        public static final UniqueKey<AddressInternalTransactionCountDeltaRecord> ADDRESS_INTERNAL_TRANSACTION_COUNT_DEL_ADDRESS_BLOCK_NUMBER_KEY = Internal.createUniqueKey(AddressInternalTransactionCountDelta.ADDRESS_INTERNAL_TRANSACTION_COUNT_DELTA, "address_internal_transaction_count_del_address_block_number_key", AddressInternalTransactionCountDelta.ADDRESS_INTERNAL_TRANSACTION_COUNT_DELTA.ADDRESS, AddressInternalTransactionCountDelta.ADDRESS_INTERNAL_TRANSACTION_COUNT_DELTA.BLOCK_NUMBER);
        public static final UniqueKey<AddressTokenCountRecord> ADDRESS_TOKEN_COUNT_PKEY = Internal.createUniqueKey(AddressTokenCount.ADDRESS_TOKEN_COUNT, "address_token_count_pkey", AddressTokenCount.ADDRESS_TOKEN_COUNT.ADDRESS, AddressTokenCount.ADDRESS_TOKEN_COUNT.TOKEN_TYPE, AddressTokenCount.ADDRESS_TOKEN_COUNT.BLOCK_NUMBER);
        public static final UniqueKey<AddressTokenCountDeltaRecord> ADDRESS_TOKEN_COUNT_DELTA_PKEY = Internal.createUniqueKey(AddressTokenCountDelta.ADDRESS_TOKEN_COUNT_DELTA, "address_token_count_delta_pkey", AddressTokenCountDelta.ADDRESS_TOKEN_COUNT_DELTA.ID);
        public static final UniqueKey<AddressTransactionCountRecord> ADDRESS_TRANSACTION_COUNT_PKEY = Internal.createUniqueKey(AddressTransactionCount.ADDRESS_TRANSACTION_COUNT, "address_transaction_count_pkey", AddressTransactionCount.ADDRESS_TRANSACTION_COUNT.ADDRESS, AddressTransactionCount.ADDRESS_TRANSACTION_COUNT.BLOCK_NUMBER);
        public static final UniqueKey<AddressTransactionCountDeltaRecord> ADDRESS_TRANSACTION_COUNT_DELTA_PKEY = Internal.createUniqueKey(AddressTransactionCountDelta.ADDRESS_TRANSACTION_COUNT_DELTA, "address_transaction_count_delta_pkey", AddressTransactionCountDelta.ADDRESS_TRANSACTION_COUNT_DELTA.ID);
        public static final UniqueKey<AddressTransactionCountDeltaRecord> ADDRESS_TRANSACTION_COUNT_DELTA_ADDRESS_BLOCK_NUMBER_KEY = Internal.createUniqueKey(AddressTransactionCountDelta.ADDRESS_TRANSACTION_COUNT_DELTA, "address_transaction_count_delta_address_block_number_key", AddressTransactionCountDelta.ADDRESS_TRANSACTION_COUNT_DELTA.ADDRESS, AddressTransactionCountDelta.ADDRESS_TRANSACTION_COUNT_DELTA.BLOCK_NUMBER);
        public static final UniqueKey<BalanceRecord> BALANCE_PKEY = Internal.createUniqueKey(Balance.BALANCE, "balance_pkey", Balance.BALANCE.ID);
        public static final UniqueKey<BalanceDeltaRecord> BALANCE_DELTA_PKEY = Internal.createUniqueKey(BalanceDelta.BALANCE_DELTA, "balance_delta_pkey", BalanceDelta.BALANCE_DELTA.ID);
        public static final UniqueKey<BlockHeaderRecord> BLOCK_HEADER_PKEY = Internal.createUniqueKey(BlockHeader.BLOCK_HEADER, "block_header_pkey", BlockHeader.BLOCK_HEADER.NUMBER);
        public static final UniqueKey<BlockHeaderRecord> BLOCK_HEADER_HASH_KEY = Internal.createUniqueKey(BlockHeader.BLOCK_HEADER, "block_header_hash_key", BlockHeader.BLOCK_HEADER.HASH);
        public static final UniqueKey<BlockHeaderRecord> BLOCK_HEADER_PARENT_HASH_KEY = Internal.createUniqueKey(BlockHeader.BLOCK_HEADER, "block_header_parent_hash_key", BlockHeader.BLOCK_HEADER.PARENT_HASH);
        public static final UniqueKey<BlockMetricsHeaderRecord> BLOCK_METRICS_HEADER_NUMBER_TIMESTAMP_KEY = Internal.createUniqueKey(BlockMetricsHeader.BLOCK_METRICS_HEADER, "block_metrics_header_number_timestamp_key", BlockMetricsHeader.BLOCK_METRICS_HEADER.NUMBER, BlockMetricsHeader.BLOCK_METRICS_HEADER.TIMESTAMP);
        public static final UniqueKey<BlockMetricsTraceRecord> BLOCK_METRICS_TRACE_NUMBER_TIMESTAMP_KEY = Internal.createUniqueKey(BlockMetricsTrace.BLOCK_METRICS_TRACE, "block_metrics_trace_number_timestamp_key", BlockMetricsTrace.BLOCK_METRICS_TRACE.NUMBER, BlockMetricsTrace.BLOCK_METRICS_TRACE.TIMESTAMP);
        public static final UniqueKey<CanonicalCountRecord> CANONICAL_COUNT_PKEY = Internal.createUniqueKey(CanonicalCount.CANONICAL_COUNT, "canonical_count_pkey", CanonicalCount.CANONICAL_COUNT.ENTITY, CanonicalCount.CANONICAL_COUNT.BLOCK_NUMBER);
        public static final UniqueKey<CoinExchangeRateRecord> COIN_EXCHANGE_RATE_PKEY = Internal.createUniqueKey(CoinExchangeRate.COIN_EXCHANGE_RATE, "coin_exchange_rate_pkey", CoinExchangeRate.COIN_EXCHANGE_RATE.ID);
        public static final UniqueKey<ContractRecord> CONTRACT_PKEY = Internal.createUniqueKey(Contract.CONTRACT, "contract_pkey", Contract.CONTRACT.ADDRESS);
        public static final UniqueKey<ContractHolderCountRecord> CONTRACT_HOLDER_COUNT_PKEY = Internal.createUniqueKey(ContractHolderCount.CONTRACT_HOLDER_COUNT, "contract_holder_count_pkey", ContractHolderCount.CONTRACT_HOLDER_COUNT.CONTRACT_ADDRESS, ContractHolderCount.CONTRACT_HOLDER_COUNT.BLOCK_NUMBER, ContractHolderCount.CONTRACT_HOLDER_COUNT.TOKEN_TYPE);
        public static final UniqueKey<ContractHolderCountDeltaRecord> CONTRACT_HOLDER_COUNT_DELTA_PKEY = Internal.createUniqueKey(ContractHolderCountDelta.CONTRACT_HOLDER_COUNT_DELTA, "contract_holder_count_delta_pkey", ContractHolderCountDelta.CONTRACT_HOLDER_COUNT_DELTA.ID);
        public static final UniqueKey<ContractMetadataRecord> CONTRACT_METADATA_PKEY = Internal.createUniqueKey(ContractMetadata.CONTRACT_METADATA, "contract_metadata_pkey", ContractMetadata.CONTRACT_METADATA.ADDRESS);
        public static final UniqueKey<EthListContractMetadataRecord> ETH_LIST_CONTRACT_METADATA_PKEY = Internal.createUniqueKey(EthListContractMetadata.ETH_LIST_CONTRACT_METADATA, "eth_list_contract_metadata_pkey", EthListContractMetadata.ETH_LIST_CONTRACT_METADATA.ADDRESS);
        public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "flyway_schema_history_pk", FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK);
        public static final UniqueKey<MinerBlockCountRecord> MINER_BLOCK_COUNT_PKEY = Internal.createUniqueKey(MinerBlockCount.MINER_BLOCK_COUNT, "miner_block_count_pkey", MinerBlockCount.MINER_BLOCK_COUNT.AUTHOR, MinerBlockCount.MINER_BLOCK_COUNT.BLOCK_NUMBER);
        public static final UniqueKey<ProcessorHashLogRecord> PROCESSOR_HASH_LOG_PKEY = Internal.createUniqueKey(ProcessorHashLog.PROCESSOR_HASH_LOG, "processor_hash_log_pkey", ProcessorHashLog.PROCESSOR_HASH_LOG.PROCESSOR_ID, ProcessorHashLog.PROCESSOR_HASH_LOG.BLOCK_NUMBER);
        public static final UniqueKey<SyncStatusRecord> SYNC_STATUS_PKEY = Internal.createUniqueKey(SyncStatus.SYNC_STATUS, "sync_status_pkey", SyncStatus.SYNC_STATUS.COMPONENT);
        public static final UniqueKey<SyncStatusHistoryRecord> SYNC_STATUS_HISTORY_PKEY = Internal.createUniqueKey(SyncStatusHistory.SYNC_STATUS_HISTORY, "sync_status_history_pkey", SyncStatusHistory.SYNC_STATUS_HISTORY.COMPONENT, SyncStatusHistory.SYNC_STATUS_HISTORY.BLOCK_NUMBER);
        public static final UniqueKey<TokenExchangeRateRecord> TOKEN_EXCHANGE_RATE_PKEY = Internal.createUniqueKey(TokenExchangeRate.TOKEN_EXCHANGE_RATE, "token_exchange_rate_pkey", TokenExchangeRate.TOKEN_EXCHANGE_RATE.ADDRESS);
        public static final UniqueKey<TraceRecord> TRACE_BLOCK_HASH_TRANSACTION_HASH_KEY = Internal.createUniqueKey(Trace.TRACE, "trace_block_hash_transaction_hash_key", Trace.TRACE.BLOCK_HASH, Trace.TRACE.TRANSACTION_HASH);
        public static final UniqueKey<TransactionRecord> TRANSACTION_PKEY = Internal.createUniqueKey(Transaction.TRANSACTION, "transaction_pkey", Transaction.TRANSACTION.HASH);
        public static final UniqueKey<TransactionReceiptRecord> TRANSACTION_RECEIPT_PKEY = Internal.createUniqueKey(TransactionReceipt.TRANSACTION_RECEIPT, "transaction_receipt_pkey", TransactionReceipt.TRANSACTION_RECEIPT.TRANSACTION_HASH);
        public static final UniqueKey<UncleRecord> UNCLE_PKEY = Internal.createUniqueKey(Uncle.UNCLE, "uncle_pkey", Uncle.UNCLE.HASH);
    }
}

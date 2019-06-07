(ns district-registry.shared.smart-contracts-dev)

  (def smart-contracts
    {:ds-guard {:name "DSGuard" :address "0x77b06ccd88fb19cb35c47c006667490704026677"} :minime-token-factory {:name "MiniMeTokenFactory" :address "0x45f10347a6ca2b39199976c3899b9427922d51d2"} :DNT {:name "District0xNetworkToken" :address "0x1cb6a106f8f3c7c4325f297b872f8c1bb01fb4f0"} :district-registry-db {:name "EternalDb" :address "0xc45c02591e29772df1d106acf782d00e51219f09"} :param-change-registry-db {:name "EternalDb" :address "0x1977e802e4b82051f6f6d6ff4379cf8f8ad674de"} :district-registry {:name "DistrictRegistry" :address "0x776c3940334a1a01e5b918bb2ff9dcb674ce6ed8"} :district-registry-fwd {:name "MutableForwarder" :address "0xb6bd02943233d8644fb31141eda4275efbfb8c64" :forwards-to :district-registry} :param-change-registry {:name "ParamChangeRegistry" :address "0x9b16ac675499acbc7431f49aa5097883fec46c48"} :param-change-registry-fwd {:name "MutableForwarder" :address "0xd223d2c42235d0c09ab69766ccc514ce06c602bb" :forwards-to :param-change-registry} :power-factory {:name "PowerFactory" :address "0xa68e93ac0de62c8dbe62c4c169327a6bf94e7bed"} :stake-bank-factory {:name "StakeBankFactory" :address "0xad2dd6ec556b3e6042aa7e58f356616f79f8adb2"} :challenge-factory {:name "ChallengeFactory" :address "0xdc561d5ad7157980bc6620cf3c67b66afb31356b"} :district {:name "District" :address "0xd642911d65a97e458e683d04271e575aac6c0652"} :param-change {:name "ParamChange" :address "0xbbbb20f38e2ee10d615992118bc02e339d2e91c5"} :district-factory {:name "DistrictFactory" :address "0xccc2c0174e15d55f8429b074c06effa979179810"} :param-change-factory {:name "ParamChangeFactory" :address "0x5dfedfde0d952ae0486c9a107613eaf16b5ccb74"}})

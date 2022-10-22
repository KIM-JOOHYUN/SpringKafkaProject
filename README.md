## Overview : Kafka

### ✔️ Kafka란?

- 데이터를 Stream pipeline을 통해 실시간으로 관리하고 내보내기 위한 **분산 데이터 스트리밍 플랫폼**.
    - `Pub-Sub` 모델의 `MQ(Message Queue)`
        - 데이터를 생성하는 Application(**Producer**)과 데이터를 소비하는 Application(**Consumer**) 간의 중재자 역할을 함으로써 **데이터의 전송 제어, 처리, 관리 역할**을 한다.
        - Kafka에서는, **Producer**가 보내는 메세지를 **Topic**이라는 카테고리로 묶어서 보내고, **Consumer**가 해당 **Topic을 구독**하여 Message를 받는 프로그래밍 모델**(Pub-Sub모델)**을 사용한다.
        - Producer와 Consumer는 완전 분리되어 있다. Producer는 Broker의 Topic에 메세지를 게시하기만 하면 됨. Consumer는 Broker의 특정 Topic에서 메세지를 가져와 처리하기만 함.
        - 기존에 분산 되어 있는 데이터 처리를  한 곳에 집중**(Message Queue)**하여 **메세지 브로커**를 두어 작업을 분산하는 것이 목적.

### ✔️ Kafka Broker란?

- Producer와 Consumer 사이의 중재자로 **Kafka 서버**를 가리킨다.

### ✔️ Zookeeper란?

- Kafka 브로커를 관리하고 조정

### ✔️ Kafka Streams란?

- Kafka Streams는 Kafka Streams API를 사용하여 지속적으로 흘러들어오는 데이터에 대한 분석, 처리를 위한 클라이언트 라이브러리
    - Topic(Kafka로 들어오는 데이터)을 Consume ⇒ Kafka Stream API를 통해 처리 ⇒ 다른 Topic으로 전송하거나 끝내기

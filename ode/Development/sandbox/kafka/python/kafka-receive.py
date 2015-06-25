from kafka import KafkaConsumer

# To consume messages
topic_name = 'my-topic' # default for testing is my-topic
consumer = KafkaConsumer(topic_name,
                        # group_id='group3',
                         bootstrap_servers=['ip-10-0-16-12.ec2.internal:6667','ip-10-0-16-91.ec2.internal:6667','ip-10-0-16-97.ec2.internal:6667'])
for message in consumer:
    # message value is raw byte string -- decode if necessary!
    # e.g., for unicode: `message.value.decode('utf-8')`
    print("%s:%d:%d: key=%s value=%s" % (message.topic, message.partition,
                                         message.offset, message.key,
                                         message.value))

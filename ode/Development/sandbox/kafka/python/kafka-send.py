
from kafka import SimpleProducer, KafkaClient

# To send messages synchronously

kafka = KafkaClient('ip-10-0-16-91.ec2.internal:6667')
producer = SimpleProducer(kafka)

# Note that the application is responsible for encoding messages to type bytes
producer.send_messages(b'my-topic', b'some message')
producer.send_messages(b'my-topic', b'this method', b'is variadic')


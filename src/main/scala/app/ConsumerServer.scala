package app

import akka.actor.ActorSystem

import scala.concurrent.ExecutionContext

object ConsumerServer extends App {

  val system = ActorSystem("kafka-consumer")

  implicit val ec: ExecutionContext = system.dispatcher

  val postConsumer = PostConsumer()

  postConsumer.run()

}
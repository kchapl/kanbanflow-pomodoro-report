package report

import java.util.Base64
import java.nio.charset.StandardCharsets
import java.nio.charset.StandardCharsets.UTF_8
import io.circe.*
import io.circe.parser.*

object Main extends App {

  val apiKey = sys.env("KANBANFLOW_DELIVERY_API_KEY")

  val r = requests.get(
    "https://kanbanflow.com/api/v1/pomodoro-entries?from=2022-10-14T00:00:00Z&to=2022-10-15T00:00:00Z&limit=100",
    auth = "apiToken" -> apiKey
  )

  println(r.statusCode)
  println(parse(r.text()))
}

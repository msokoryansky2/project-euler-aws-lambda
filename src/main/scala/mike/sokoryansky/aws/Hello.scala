package mike.sokoryansky.aws

import java.io.{BufferedReader, InputStreamReader}
import java.util.stream.Collectors

class Hello {
  import java.io.{InputStream, OutputStream}

  def greeting(input: InputStream, output: OutputStream): Unit = {
    val json: String = new BufferedReader(new InputStreamReader(input)).lines().collect(Collectors.joining("\n"))
    val result = s"Yo! I got this: $json"
    output.write(result.getBytes("UTF-8"))
  }
}

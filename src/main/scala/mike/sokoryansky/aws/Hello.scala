package mike.sokoryansky.aws

class Hello {
  import java.io.{InputStream, OutputStream}

  def greeting(input: InputStream, output: OutputStream): Unit = {
    val result = s"Yo!"
    output.write(result.getBytes("UTF-8"))
  }
}

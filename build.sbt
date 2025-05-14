name := "foo-bar-test"
organization := "com.michaelpollmeier"
scalaVersion := "3.7.0"

developers := List(
  Developer("mpollmeier",
            "Michael Pollmeier",
            "michael@michaelpollmeier.com",
            url("https://michaelpollmeier.com")))
licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))
publishTo := sonatypePublishToBundle.value

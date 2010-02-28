# Template engine shootout on the JVM

Small benchmark utility for testing different templating engines available on the JVM.
I was mainly interested to see how a JavaScript-based engine would perform against Freemarker/Velocity.

Engines tested:
* StringTemplate
* Freemarker
* Velocity
* JSTE (JavaScript template engine)
* Groovy Simple Template

## Sample output

Real = Wall clock time in ms
User = Time spent in userland in ms
System = Time spent in systemland in ms
CPU = Total CPU time spent in ms
tpls/sec = number of generated templates per CPU second
ms/tpl = time spent per template in generation


           Iterations: 100000
    Warmup iterations: 10000

    Test: STOCK_MARKET
                              Test |     Real |     User |   System |      CPU |   tpls/sec |   ms/tpl
    ---------------------------------------------------------------------------------------------------
          GroovySimpleTemplateTest      30206      26607        571      27179     3679.31       0.27
                          JsteTest      36008      33747        670      34418     2905.46       0.34
                StringTemplateTest       8068       7471        152       7623    13118.19       0.08
                      VelocityTest       6586       6104        125       6230    16051.36       0.06
                    FreemarkerTest      11654      10852        216      11069     9034.24       0.11


## Todo

* A pure Java template, just for reference
* More test types (template imports would next in line for testing)
* Fix resource loading (can only be loaded when exploded/run from an IDE)

## Authors

- Carl Bystr&ouml;m <http://www.pedantique.org/>

## License

Open source licensed under MIT (see _LICENSE_ file for details).


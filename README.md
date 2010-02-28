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

* Real = Wall clock time in ms
* User = Time spent in userland in ms
* System = Time spent in systemland in ms
* CPU = Total CPU time spent in ms
* tpls/sec = number of generated templates per CPU second
* ms/tpl = time spent per template in generation



       Iterations: 50000
    Warmup iterations: 10000

    Test: STOCK_MARKET
                              Test |     Real |     User |   System |      CPU |   tpls/sec |   ms/tpl
    ---------------------------------------------------------------------------------------------------
          GroovySimpleTemplateTest      14092      13319        258      13578     3682.43       0.27
                          JsteTest      35619      33634        636      34270     1459.00       0.69
                StringTemplateTest       3958       3675         77       3753    13322.68       0.08
                      VelocityTest       3281       2911         59       2971    16829.35       0.06
                    FreemarkerTest       5969       5078        100       5178     9656.24       0.10
                          JavaTest        659        607         10        617    81037.28       0.01
                     JavaTypedTest        555        507         10        517    96711.80       0.01


## Todo

* A pure Java template, just for reference
* More test types (template imports would next in line for testing)
* Fix resource loading (can only be loaded when exploded/run from an IDE)

## Authors

- Carl Bystr&ouml;m <http://www.pedantique.org/>

## License

Open source licensed under MIT (see _LICENSE_ file for details).

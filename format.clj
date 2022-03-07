(def aString "hello")
(def aLong 15)
(def aDouble 1.45)

(println (format "This is string %s" aString))
(println (format "5 spaces and %5d" aLong))
(println (format "Leading zeros %04d" aLong))
(println (format "1 decimal %.1f" aDouble))

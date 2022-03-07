; LOOPS

(defn factorial [n]
  (if (> n 1)
    (* n (factorial (dec n)))
    1))

(fac 4)

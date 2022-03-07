; FUNCTIONS

; functions are just values

; anonymous function
(fn [a b]
  (+ a b))

(def add-2
  (fn [a b]
    (+ a b)))

(add-2 1 3)

(defn add-3 [a b c] (+ a b c))

(add-3 1 2 3)

; multi-arity
(defn add-more
  ([a b]
   (+ a b))
  ([a b c]
   (+ a b c))
)

(add-more 1 2)
(add-more 1 2 3)

; argument list
(defn add-all
  [& x]
  x)

(add-all 1 2 3 4 5)

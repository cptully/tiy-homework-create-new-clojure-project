(ns tiy-homework-create-new-clojure-project.core)

(defn -main []
  (def x1 5)
  (def x2 45)
  (def d1 5.43)
  (def d2 99.321)

  ;; integer addition
  (println "x1 plus x2: "  (+ x1  x2))

  ;; integer subtraction
  (println "x1 minus x2: "  (- x1  x2))

  ;; integer multiplication
  (println "x1 times x2: "  (* x1  x2))

  ;; integer division
  (println "x1 divide by x2: "  (/ x1  x2))

  ;; double addition
  (println "d1 plus d2: "  (+ d1  d2))

  ;; double subtraction
  (println "d1 minus d2: "  (- d1  d2))

  ;; double multiplication
  (println "d1 times d2: "  (* d1  d2))

  ;; double division
  (println "d1 divide by d2: "  (/ d1  d2))

  ;; adding a double to an integer
  (println "x1 plus d2: "  (+ x1  d2))

  ;; multiplying a double with an integer
  (println "d1 times x2: "  (+ d1  x2))
  )
(-main)
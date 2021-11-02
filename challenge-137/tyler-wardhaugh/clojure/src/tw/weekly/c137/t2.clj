(ns tw.weekly.c137.t2
  (:require [clojure.edn :as edn]))

;;;
; Task description for TASK #2 › Lychrel Number
;;;
(def DEFAULT-INPUT [56])

(defn -main
  "Run Task 2 with a given input N, defaulting to the first example from the
  task description."
  [& args]
  (let [[N] (or (some->> args (map edn/read-string)) DEFAULT-INPUT)]))

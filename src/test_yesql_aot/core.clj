(ns test-yesql-aot.core
  (:require [yesql.core :refer [defqueries]]))

(defqueries "sql/queries.sql")

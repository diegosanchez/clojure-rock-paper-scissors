(ns kata.rock-paper-scissors-test
  (:require [clojure.test :refer :all]
            [kata.rock-paper-scissors :refer :all]))

(deftest a-test-0
  (testing "Winner"
    (is (= :sissors (winner :scissors :paper)))))


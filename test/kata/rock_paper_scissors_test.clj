(ns kata.rock-paper-scissors-test
  (:require [clojure.test :refer :al]l
            [kata.rock-paper-scissors :refer :all]))

(deftest sissors-test
  (testing "Winner"
    (is (= :sissors (winner :scissors :paper)))
    (is (= :sissors (winner :paper :scissors)))))

;; (deftest rock-test
;;   (testing "Winner"
;;     (is (= :rock (winner :rock :sissors)))
;;     (is (= :rock (winner :scissors :rock)))))


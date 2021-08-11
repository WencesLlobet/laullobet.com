(ns xviii-lization.core-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            [xviii-lization.core :as core]))

(deftest fake-test
  (testing "fake description"
    (is (= 1 1))))
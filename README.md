# This is a small effort to demosntrate the effect of a java garbage collection switch called UseStringDeduplication.

# I found the following blogs quite interesting and wanted to test the effect on a data drivem REST API.


## https://dzone.com/articles/easy-change-to-reduce-memory-by-20

## https://stackoverflow.com/questions/12295824/create-heap-dump-from-within-application-without-hotspotdiagnosticmxbean

## Java Online Heap Analysis Tool Free of Cost : https://heaphero.io/index.jsp

# How to run the REST API

## With Dedup : java  -Xmx2000M -XX:+UseG1GC -XX:+UseStringDeduplication -jar target/g1-gc-search-rest-api.jar

## Without Dedup :  java  -Xmx2000M -XX:+UseG1GC  -jar target/g1-gc-search-rest-api.jar

# How to run the java main sample

# 1. Without Dedup : java  -Xmx20M -XX:+UseG1GC com.rollingstone.StringDeduplicationExample C:/udemy/G1GC/G1Test_without_spring_dedup.hprof

# 2. With Dedup : java  -Xmx20M -XX:+UseG1GC -XX:+UseStringDeduplication com.rollingstone.StringDeduplicationExample C:/udemy/G1GC/G1Test_with_spring_dedup.hprof

# The pdfs I generated both for my REST API and also for the sample java main program are attached with the repository.

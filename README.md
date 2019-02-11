# This is a small effort to demosntrate the effect of a java garbage collection switch called UseStringDeduplication.

# I found the following blogs quite interesting and wanted to test the effect on a data driven REST API.


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

# In my toy REST API, it is showing a save of close to 3 MB of memory using that special switch while starting the application.

# G1 by the way is the default gargage collecttion algorithtm starting Java 9. While it still holds the conceptual Young, Survivor and Old Generation regions like other popular java Garbage Collectors such as CMS or Parallel GC, G1 devides the entire heap into multiple smaller regions of 2-3 MB each. Each such smaller region then plays either a Young / Survivor or Old generation role. The advantage is that G1 can focus on smaller regions to collect in a much faster time. G1 also tries to collect the regions that is more full with garbage. 

# It is time that our very own existing knowledge about java garbage colletion is subjected to garbage collection in our minds and be replaced with some new information about the G1.

FROM java:8-jdk
RUN mkdir proj2
ADD ./out.jar /proj2/
ADD ./src /proj2/
ADD startup.sh /
ENTRYPOINT startup.sh
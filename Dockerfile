FROM java:8-jdk
ADD ./out.jar /
ADD ./src/proj2/Program.java /prog2
ADD startup.sh /
RUN chmod ug+x /startup.sh
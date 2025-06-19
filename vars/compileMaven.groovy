def call() {
    echo "Running mvn clean compile..."
    sh 'mvn -N io.takari:maven:wrapper'
    sh 'mvn clean compile'
}
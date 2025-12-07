def call() {
    stage("Check Node.js Syntax (.mjs)") {
        echo "Checking syntax for all .mjs files..."

        // find all .mjs files and run `node --check` on them
        sh """
            for f in \$(find . -name '*.mjs'); do
                echo "Checking syntax: \$f"
                node --check \$f
            done
        """
    }
}


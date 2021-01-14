package localstack.java;

import software.amazon.awscdk.core.App;
import software.amazon.awscdk.core.AppProps;
import software.amazon.awscdk.core.Construct;
import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.services.kms.Key;
import software.amazon.awscdk.services.kms.KeyProps;

public class Main extends App {

    private static final String OUTPUT_DIR = "cdk.out";

    public static void main(final String[] args) {
        final App app = new App(new AppProps.Builder()
                .outdir(OUTPUT_DIR)
                .build());

        new AppGenerator(app, "localstack-java");

        app.synth();
    }
}

class AppGenerator extends Stack {

    public AppGenerator(final Construct scope, final String id) {
        super(scope, id);

        new KmsStack(this, "kms-key-stack");
    }
}

class KmsStack extends Stack {

    public KmsStack(final Construct scope, final String id) {
        super(scope, id);

        new Key(this, id, KeyProps.builder().build());
    }
}
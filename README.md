# Localstack Java Skeleton
Skeleton project always using the latest versions of dependencies. 

Execute: 'launch.sh' to compile and run Localstack via Docker. 

## Known runtime errors: 
```shell
2021-01-14T15:20:38:WARNING:localstack.utils.cloudformation.template_deployer: Unable to deploy resource type "CDK::Metadata": {'Type': 'AWS::CDK::Metadata', 'Properties': {'Modules': 'aws-cdk=1.82.0,@aws-cdk/aws-iam=1.84.0,@aws-cdk/aws-kms=1.84.0,@aws-cdk/cloud-assembly-schema=1.84.0,@aws-cdk/core=1.84.0,@aws-cdk/cx-api=1.84.0,@aws-cdk/region-info=1.84.0,jsii-runtime=Java/11.0.9.1'}, 'Metadata': {'aws:cdk:path': 'error-stack/CDKMetadata/Default'}, 'Condition': 'CDKMetadataAvailable', 'LogicalResourceId': 'CDKMetadata', 'PhysicalResourceId': None}
```
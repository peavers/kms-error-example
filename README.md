# KMS Error
Skeleton project showing a problem with KMS and Localstack. 

Execute: 'launch.sh' to compile and run Localstack via Docker. 

## Error: 
```shell
2021-01-07T10:32:04:WARNING:localstack.utils.cloudformation.template_deployer: Unknown resource type "KMS::Key" in resource deployment map: {'Type': 'AWS::KMS::Key', 'Properties': {'KeyPolicy': {'Statement': [{'Action': ['kms:Create*', 'kms:Describe*', 'kms:Enable*', 'kms:List*', 'kms:Put*', 'kms:Update*', 'kms:Revoke*', 'kms:Disable*', 'kms:Get*', 'kms:Delete*', 'kms:ScheduleKeyDeletion', 'kms:CancelKeyDeletion', 'kms:GenerateDataKey', 'kms:TagResource', 'kms:UntagResource'], 'Effect': 'Allow', 'Principal': {'AWS': {'Fn::Join': ['', ['arn:', {'Ref': 'AWS::Partition'}, ':iam::', {'Ref': 'AWS::AccountId'}, ':root']]}}, 'Resource': '*'}], 'Version': '2012-10-17'}, 'Tags': [{'Key': 'project', 'Value': 'poc'}]}, 'UpdateReplacePolicy': 'Retain', 'DeletionPolicy': 'Retain', 'Metadata': {'aws:cdk:path': 'poc/kms-key/kms-key/Resource'}}
```
This prevents KMS from being usable as a import in other cloudformation templates. 
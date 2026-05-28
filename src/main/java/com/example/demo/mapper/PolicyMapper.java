package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.entity.Policy;

//@Mapper
public interface PolicyMapper {

    @Select("""
                SELECT id,
                       policy_No AS policyNo,
                       customer,
                       product_Name AS productName,
                       premium,
                       insured_Amount AS insuredAmount,
                       start_Date AS startDate,
                       end_Date AS endDate,
                       status
                FROM policies
            """)
    List<Policy> findAll();

    @Select("""
                SELECT id,
                       policy_No AS policyNo,
                       customer,
                       product_Name AS productName,
                       premium,
                       insured_Amount AS insuredAmount,
                       start_Date AS startDate,
                       end_Date AS endDate,
                       status
                FROM policies
                WHERE id = #{id}
            """)
    Policy findById(Integer id);

    @Insert("""
                INSERT INTO customers (
                    policy_No,
                    customer,
                    product_Name,
                    premium,
                    insured_Amount,
                    start_Date,
                    end_Date,
                    status
                ) VALUES (
                    #{policy_No},
                    #{customer},
                    #{product_Name},
                    #{premium},
                    #{insured_Amount},
                    #{start_Date},
                    #{end_Date},
                    #{status}
                )
            """)
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(Policy policy);

    @Update("""
                UPDATE policies
                SET policy_No = #{policyNo},
                    customer = #{customer},
                    product_Name = #{productName},
                    premium = #{premium},
                    insured_Amount = #{insuredAmount},
                    start_Date = #{startDate},
                    end_Date = #{endDate},
                    status = #{status}
                WHERE id = #{id}
            """)
    int update(Policy policy);

    @Delete("""
                DELETE FROM policies
                WHERE id = #{id}
            """)
    int deleteById(Integer id);
}